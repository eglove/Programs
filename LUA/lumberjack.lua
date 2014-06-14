--[[ Simple lumberjack program for the wiki.  Assumes the turtle is in the 
	bottom left corner of a 10 ahead and 3 to the right area of clear dirt or
	grass.  Also, only works for oak saplings, since they can grow next to each
	other. ]]--
local saplings = 1 -- the slot where the saplings are
turtle.select(saplings) -- select the saplings
while turtle.getItemCount(saplings) > 0 do -- while more saplings in inventory
	for i = 1, 8 do -- plant 8 saplings in a row
		turtle.turnRight()
		if not turtle.compare() then -- if not a sapling, then a tree grew
			turtle.dig()
			turtle.forward()
			while turtle.detectUp() do -- dig tree out
				turtle.digUp()
				turtle.up()
			end
			while not turtle.detectDown() do -- back down to ground
				turtle.down()
			end
			turtle.back()
			turtle.place() -- put down new sapling
		end
		turtle.turnLeft()
		turtle.forward()
	end
	-- turn around and line up for next pass
	turtle.turnRight()
	turtle.forward()
	turtle.forward()
	turtle.turnRight()
	turtle.forward()
	os.sleep(30) -- sleep for 30 seconds to allow trees to grow
end