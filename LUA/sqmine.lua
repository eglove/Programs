count = 0 -- Global

function torch()
	turtle.select(1)
	turtle.turnLeft()
	turtle.dig()
	turtle.place()
	turtle.turnRight()
end
function tunnelFor()
	turtle.dig()
	turtle.forward()
	turtle.digUp()
	count = count + 1
	if count % 7 == 0 then
		torch()
	end
function tunnel(n)
end
	for i = 1,n-1 do
		tunnelFor()
	end
	turtle.turnRight()
end
function tunnelLastWall(n)
	for i = 1,n-4 do
		tunnelFor()
	end
	turtle.turnRight()
function driver(n)
	for i = 1,3 do
		tunnel(n)
	end
	tunnelLastWall(n)
	for i = 1,3 do
		tunnelFor()
	end
end

local n
print("Enter size of square mine (less than 64): ");
n = tonumber(read())

while n >= 0 do
	driver(n)
	n = n - 6
end