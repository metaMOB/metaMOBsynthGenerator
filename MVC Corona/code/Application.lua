require "AppContext"
require "views.ViewA"
require "views.ViewB"
Application = {}

function Application:new()
	local application = display.newGroup()
	application.classType = "Application"
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
		-- local viewName = self:getEmployeeViewBasedOnOrientation(self.lastKnownOrientation)
		-- print("viewName returned based on last known orientation:", viewName)
		if name == "viewA" then
      print ("hu")
			view = ViewA:new(self)
		elseif name == "viewB" then
      print ("ha")
			view = ViewB:new(self)
		end

		self.currentView = view
	end

	application:init()

	return application
end

return Application