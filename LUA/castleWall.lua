function placeBlock(n) -- Place block below, move forward
	for i = 1,n do
		turtle.placeDown()
		turtle.forward()
	end
end
function turnAround() -- 180 deg turn
	turtle.turnLeft()
	turtle.turnLeft()
end
function backUp(n) -- Move back n times
	for i = 1,n do
		turtle.back()
	end
end
function forward(n) --  Move forward n times
	for i = 1,n do
		turtle.forward()
	end
end
function down(n) -- Move down n times
	for i = 1,n do
		turtle.down()
	end
end
function planks()
	turtle.select(1) -- Wood Plank: 16 per section
	placeBlock(6) -- Place 6 wood planks
	for i = 1,2 do -- Moves to second row
		turtle.turnLeft()
		turtle.forward()
	end
	placeBlock(6) -- Places second plank row
end
function cobblestone()
	turtle.select(2) -- Cobblestone: 18 per section
	turtle.up() -- Up and around to place new row on top
	turnAround()
	placeBlock(6) -- Uses place/forward pattern, loop not possible
	turtle.up()
	turnAround()
	turtle.forward() -- Extra forward to account for place/forward pattern
	placeBlock(6)
	turtle.up()
	turnAround()
	placeBlock(6)
end
function plankEdge()
	turtle.turnLeft() -- Move up and left for spider blocker
	turtle.forward()
	turtle.turnLeft()
	turtle.up()
	turtle.select(1) -- Wood Plank: 16 per section
	for i = 1,4 do -- Old forward/place pattern (works here)
		turtle.forward()
		turtle.placeDown()
	end
end
function pillars()
	turtle.select(3) -- Wood: 12 per section
	turtle.forward()
	down(5) -- Start building from bottom
	for i = 1,6 do
		turtle.up()
		turtle.placeDown()
	end
	backUp(2) -- Get to spot to place torch
	turtle.down()
	turtle.select(4) -- Torch: 2 per section
	turtle.place()
	turtle.up() -- Move to next pillar
	forward(3)
	down(6)
	turtle.select(3) -- Wood: 12 per section
	for i = 1,6 do
		turtle.up()
		turtle.placeDown()
	end
	forward(2) -- Move to second torch
	turnAround()
	turtle.down()
	turtle.select(4) -- Torch: 4 per section
	turtle.place() -- Place 2nd torch
end
function ladders()
	turtle.turnRight() -- Move to position for ladders
	forward(3)
	turtle.turnLeft()
	forward(2)
	turtle.turnLeft()
	down(2)
	turtle.select(5) -- Ladder: 3 per section
	for i = 1,3 do -- Place ladders
		turtle.place()
		turtle.down()
	end
end
function moveNext()
	turtle.up() -- Move into position for next section (perfect fit!)
	turtle.turnRight()
	forward(5)
	turtle.turnLeft()
	turtle.forward()
	turtle.turnRight()
	turtle.forward()
end
		
--[[Computer Craft Castle Wall (Minecolonies)(In Progress)]]--
--[[Start turtle one space off ground, disk drive to right]]--
planks()
turtle.forward()
cobblestone()
plankEdge()
pillars()
ladders()
moveNext()