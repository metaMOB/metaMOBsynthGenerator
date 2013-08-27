viewCMediator = {}

function viewCMediator:new ()
	local mediator = {}

		function mediator:onRegister()
			local view = self.viewInstance
		end
		function mediator:onRemove()
			local view = self.viewInstance
		end
   	
  	return mediator
end

return viewCMediator
