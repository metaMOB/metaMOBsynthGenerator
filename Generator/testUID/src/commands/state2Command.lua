state2Command = {}

function state2Command:new()
	local command = {}

	function command:execute(event)
		Runtime:dispatchEvent({name="showState2"})
	end
  
	return command
end

return state2Command
