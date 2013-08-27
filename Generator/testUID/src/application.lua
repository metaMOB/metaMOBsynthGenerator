require "AppContext"
require "views.viewA"
require "views.viewB"
require "views.viewC"

application = {}

function application:new()
	local application = RNGroup:new()
	application.classType = "application"
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

		if name == "viewA" then
      		view = viewA:new(self)
    elseif name == "viewB" then
      		view = viewB:new(self)
    elseif name == "viewC" then
      		view = viewC:new(self)
		end 

		self.currentView = view
	end

	application:init()

	return application
end

return application


