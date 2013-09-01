require "AppContext"
require "views.StageA"
require "views.StageB"

SeTestApp = {}

function SeTestApp:new()
	local application = RNGroup:new()
	application.classType = "SeTestApp"
	application.currentView = nil
	application.currentViewName = nil

	function application:init()
		local context = AppContext:new()
		context:init()    
		Runtime:dispatchEvent({name="onRobotlegsViewCreated", target=self})
	end

	function application:showView(name)
		if name == self.currentViewName then
			return true
		end

		if self.currentView then
			self.currentView:destroy()
			self.currentView = nil
		end

		local view

		self.currentViewName = name

		if name == "stageA" then
      		view = StageA:new(self)
    elseif name == "stageB" then
      		view = StageB:new(self)
		end 

		self.currentView = view
	end

	application:init()

	return application
end

return SeTestApp


