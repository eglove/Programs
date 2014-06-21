local count = 0 -- For torch function

function torch() -- Place torch every 7 spots
	turtle.select(1)
	turtle.turnLeft()
	gravelDig()
	turtle.place()
	turtle.turnRight()
	while(turtle.getItemCount(1) == 0) do
		turtle.dig()
	end
end

function tunnelFor() -- Tunnel forward if inventory is good
	gravelDig()
	turtle.forward()
	gravelDigUp()
	count = count + 1
	if count % 7 == 0 then
		torch()
	end
	while(turtle.getItemCount(16) > 0) do
		turtle.dig()
	end
	checkWalls() -- Helps to avoid lava/water mishaps
end

function gravelDig() -- Dig forward, checking for gravel/sand
	while(turtle.detect()) do
		turtle.dig()
	end
end

function gravelDigUp() -- Dig up, checking for gravel/sand
	while(turtle.detectUp()) do
		turtle.dig()
	end
end

function checkWalls() -- Fill in walls to avoid water/lava problems
	turtle.select(2)
	while(turtle.getItemCount(2) < 6) do
		turtle.dig()
	end
	if(turtle.detectDown() == false) then
		turtle.placeDown()
	end
	turtle.turnLeft()
	detectAndPlace()
	turnAround()
	detectAndPlace()
	gravelDigUp()
	turtle.up()
	if(turtle.detectUp() == false) then
		turtle.placeUp()
	end
	detectAndPlace()
	turnAround()
	detectAndPlace()
	turtle.turnRight()
	turtle.down();
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

function driver(n) -- Drivers whole program
	for i = 1,3 do
		tunnel(n)
	end
	tunnelLastWall(n)
	for i = 1,3 do
		tunnelFor()
	end
end

local n
print("Torches in slot 1. Cobblestone in slot 2. Please and thank you!");
print("Enter size of square mine (be reasonable!): ");
n = tonumber(read())

while n >= 0 do
	driver(n)
	n = n - 6
end