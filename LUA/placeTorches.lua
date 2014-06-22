local count = 1
local length
local width

function forward(n)
	for i=1,n do
		if turtle.detect() then
			turtle.dig()
		end
		turtle.forward()
	end
end

function turnAround()
	turtle.turnRight()
	turtle.turnRight()
end

function placeTorch()
		turtle.select(1)
		turnAround()
		turtle.place()
		turnAround()
end

function firstTorch()
	forward(1)
	placeTorch()
end

function buildRow()
	for i=1,length do
		forward(12)
		placeTorch()
	end
end

function nextRow()
	if count % 2 == 0 then -- Turn right for even numbered rows
		forward(5)
		turtle.turnRight()
		forward(8)
		placeTorch()
		turtle.turnRight()
		forward(1)
		turtle.turnRight()
		forward(1)
		turtle.turnLeft()
	else -- Turn left for odd numbered rows
		forward(5)
		turtle.turnLeft()
		forward(8)
		placeTorch()
		turtle.turnLeft()
		forward(1)
		turtle.turnLeft()
		forward(1)
		turtle.turnRight()
	end
	count = count + 1
end

function driver()
	for i = 1,width do
		buildRow()
		if i < width then -- Avoids extra row at end
			nextRow()
		end
	end
end

turtle.select(1) -- Select torches

print("How far forward? (length)")
length = tonumber(read()) / 18
print("How far left? (width)")
width = tonumber(read()) / 8

firstTorch()
driver()