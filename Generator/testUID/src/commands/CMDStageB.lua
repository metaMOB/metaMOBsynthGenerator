CMDStageB = {}

function CMDStageB:new()
	local command = {}

	function command:execute(event)
		Runtime:dispatchEvent({name="showStageA"})
	end
  
	return command
end

return CMDStageB
