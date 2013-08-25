ViewB = {}

function ViewB:new(parentGroup)
  print ("New ViewB")
	local view = RNGroup:new()
	view.classType = "ViewB"
--	view.FONT_NAME = "HelveticaNeue-Bold"
--	view.FONT = native.newFont(view.FONT_NAME)

--	if parentGroup then
--		parentGroup:insert(view)
--	end

  function view:touch(event)    
		Runtime:dispatchEvent({name="toState1"})
    --self:dispatchEvent({name="onLogin"})
	end
	
  function view:init()
    self.button = RNFactory.createButton ( "assets/images/push-button-center.png", {
      text = "View 1",
      imageOver = "assets/images/push-button-delete-center.png",
      imageDisabled = "assets/images/push-button-delete-center.png",
      top = 50,
      left = 250,
      size = 200,
      width = 50,
      height = 1,
      onTouchDown = self.touch,
      font = "arial.ttf"
    } )
  
    print ("t-------------- ")
    Runtime:dispatchEvent({name="onRobotlegsViewCreated", target=self})
	end

	

	function view:destroy()
		self.button:remove()
    Runtime:dispatchEvent({name="onRobotlegsViewDestroyed", target=self})
		self:removeSelf()
	end

	view:init()

	return view
end

return ViewB