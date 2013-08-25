require "components.PushButton"
ViewB = {}

function ViewB:new(parentGroup)
	local view = display.newGroup()
	view.classType = "ViewB"
	view.FONT_NAME = "HelveticaNeue-Bold"
	view.FONT = native.newFont(view.FONT_NAME)

	if parentGroup then
		parentGroup:insert(view)
	end

	function view:init()
	
	  local button = PushButton:new(self)
		self.button = button
		button:setSize(200, 50)
		button:setLabel("View 1")
		button:addEventListener("touch", self)

		button.y = 50
		button.x = 250

		Runtime:dispatchEvent({name="onRobotlegsViewCreated", target=self})
	end

	function view:touch(event)
		self:dispatchEvent({name="toState1"})
    --self:dispatchEvent({name="onLogin"})
	end

	function view:destroy()
		Runtime:dispatchEvent({name="onRobotlegsViewDestroyed", target=self})
		self:removeSelf()
	end

	view:init()

	return view
end

return ViewB