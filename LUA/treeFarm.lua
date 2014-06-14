function up(n)
	for i = 1,n do
		turtle.digUp()
		turtle.up()
	end
end
function down(n)
	for i = 1,n do
		if turtle.compareDown() then
			turtle.back()
			turtle.down()
		else
		turtle.digDown()
		turtle.down()
		end
	end
end
function backUp(n)
	for i = 1,n do
		turtle.back()
	end
end
function nextRow()
	turtle.forward()
	os.sleep(10) -- Pause for hopper
	turtle.forward()
	turtle.right()
	turtle.backUp(n+1) -- Beginning of row
	turtle.left()
end
function rows(m,n)
	for i = 1,m do
		for j = 1,n do
			cutTree
		end
	end
function cutTree()
	up(8) -- Dig up taking leaves
	turtle.dig()
	turtle.forward() -- Move forward
	down(8) -- Dig down taking wood
	turtle.back() -- Move back from plan11111111111111111111111111t spot
	turtle.select(1) -- Tree sapling
	turtle.place() -- Place sapling
	turtle.right() 
	turtle.forward() -- Move to next tree
	turtle.left()
end

print("How many trees (in a row)?")
n = tonumber(read())
print("How many rows?")
m = tonumber(read())
while n == n -- Infinite loop
	row(m,n)
end