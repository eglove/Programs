function driver(n) -- Drives whole program
	for i = 1,3 do
		tunnel(n)
	end
	tunnelLastWall(n)
	for i = 1,3 do
		tunnelFor()
	end
end

function tunnel(n) -- Dig a tunnel straight out
	for i = 1,n-1 do
		tunnelFor()
	end
	turtle.turnRight()
end

function tunnelLastWall(n) -- Dig fourth tunnel (shorter than normal tunnel)
	for i = 1,n-4 do
		tunnelFor()
	end
	turtle.turnRight()
end

tunnelFor() -- Tunnel forward if inventory is good
	while(turtle.getItemCount(16) > 0) do
		gravelDig()
		turtle.forward()
		gravel.DigUp()
		count=count+1
		if count % 7 == 0 then
			torch()
		end
		checkWalls()
	end
end

function checkWalls() -- Fill in walls to avoid water/lave problems
	turtle.select(2)
	if(turtle.detectDown() == false) then
		turtle.placeDown()
	end
	turtle.turnLeft()
	detectAndPlace()
	turnAround()
	detectAndPlace()
	gravelDigUp()
	turtle.up()
	if(turtle.detectUp == false) then
		turtle.placeUp()
	end
	detectAndPlace()
	turnAround()
	detectAndPlace()
	turtle.turnRight()
	turtle.down()
end

function turnAround() -- 180 degree turn
	turtle.turnRight()
	turtle.turnRight()
end

function detectAndPlace() -- Place block if nothing there
	if(turtle.detect() == false) then
		turtle.place()
	end
end

gravelDig() -- Dig forward, check for gravel/sand
	while(turtle.detect()) do
		turtle.dig()
	end
end

gravelDigUp() -- Dig up, checking for gravel/sand
	while(turtle.detectUp()) do
		turtle.digUp()
	end
end

local n
print("Torches in slot 1. Cobblestone in slot 2.");
print("Enter size of square mine.");
n = tonumber(read())

while n >= do
	driver(n)
	n = n - 6
end