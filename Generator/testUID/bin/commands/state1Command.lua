state1Command = {}

function state1Command:new()
	local command = {}

	function command:execute(event)
		Runtime:dispatchEvent({name="showState1"})
	end
  
	return command
end

return state1Command
