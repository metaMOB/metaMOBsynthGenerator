CMDStageA = {}

function CMDStageA:new()
	local command = {}

	function command:execute(event)
		Runtime:dispatchEvent({name="showStageB"})
	end
  
	return command
end

return CMDStageA
