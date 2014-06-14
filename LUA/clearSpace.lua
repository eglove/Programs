function turnAround()
	turtle.turnLeft()
	turtle.turnLeft()
end
function down(n) -- Down n times
	for i = 1,n do
		turtle.down()
	end
end
function digL() -- Dig length
	if l > 0 then
		for i = 1,l do
			turtle.dig()
			turtle.forward()
		end
	end
end
function nextRow()
	if count % 2 == 0 then -- Right for even number rows
		turtle.turnRight()
		turtle.dig()
		turtle.forward()
		turtle.turnRight()
	else -- Left for odd number rows
		turtle.turnLeft()
		turtle.dig()
		turtle.forward()
		turtle.turnLeft()
	end
	count = count + 1
end
function section()
	for i = 1,w do
		digL() -- Dig out length and move to next rows
		if i < w then -- Won't start extra row at end
			nextRow() -- Digs one whole section
		end
	end
end
function nextSection()
	turtle.digUp() -- Moves to next section (up)
	turtle.up()
	turnAround()
end
function goingUp() -- Digs base section, moves up
	for i = 1,h do -- Drives whole program
		if w % 2 == 0 then -- Even number widths need alternating nextRow
			if i % 2 == 0 then -- ^ orientations.
				count = 0
			else
				count = 1
			end
		else
			count = 1
		end
		section()
		if i < h then -- Won't go up extra block at end
			nextSection()
		end
	end
end
function goingDown() -- Go to lowest level first
	for i = 1,d do
		turtle.digDown()
		turtle.down()
	end
end

count = 1 -- For nextRow function

print("How far forward?")
l = tonumber(read()) -- Length
print("How far left?")
w = tonumber(read()) -- Width
print("How tall?")
h = tonumber(read()) -- Height
print("How deep?")
d = tonumber(read()) -- Depth

if d > 0 then
	print("Going down!")
	goingDown()
end
if h > 0 then
	print("Here I go!")
	goingUp()
end
if h > 0 then
	print("Complete.")
	down(h) -- Parks turtle in bottom corner
end