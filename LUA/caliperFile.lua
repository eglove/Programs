local distance = 0
local length, width

--[[Movement/Dig Functions]]--

function checkBelow() -- Replace block below with slot 1
	turtle.select(1)
	if turtle.compareDown() == false then
		turtle.digDown()
		turtle.place()
	end
end

function digFor() -- Dig forward
	while turtle.detect() do
		turtle.dig()
	end
end

function back(n)
	for i=1,n do
		turtle.back()
	end
end

--[[Caliper Functions]]--

function caliper()
	while turtle.detect() == false do
		turtle.forward()
		distance = distance + 1
	end
	back(distance)
	print("Distance is: ")
	print(distance)
	distance = 0
end

--[[Fill Functions]]--

function fill()
	lengthOne()
	checkBelow()
	turtle.turnLeft()
	spiralIn()
end

function lengthOne()
	for i=1,length-1 do
		checkBelow()
		digFor()
		turtle.forward()
	end
end

function spiralIn()
	while length - 1 > 0 do
		for i=1,2 do -- Dig sides of same length twice
			for j=1,length-1 do -- Dig forward and check
				digFor()
				turtle.forward()
				checkBelow()
			end
			turtle.turnLeft() -- Turn upon completion of row
		end
		length = length - 1 -- Decrease side length every two rows
	end
end

--[[Main]]--

print("Caliper or Fill? (c or f)")
local choice = read()

if choice == "c" then
	caliper()
end
if choice == "f" then
	print("How far forward? (length)")
	length = tonumber(read())
	print("How far left? (width)")
	width = tonumber(read())
	fill()
end
