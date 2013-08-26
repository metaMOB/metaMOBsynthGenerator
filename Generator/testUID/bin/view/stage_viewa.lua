viewA = {}

function viewA:new (parentGroup)
	local view = RNGroup:new()
  	view.classType = "viewA"

		function view:buttonstage2_touch(event)    
			Runtime:dispatchEvent({name="tostate2"})
		end
	

		function view:init()
			self.buttonstage2 = RNFactory.createButton ( 
				"button_off.png"
				, {
				imageOver = "button_over.png" ,
		  		imageDisabled = "button_disabled.png" ,
				onTouchDown = self.buttonstage2_touch,
				font = "arial.ttf",
				width = 200,
				height = 50,
				left = 0,
				top = 0
		 	})
			Runtime:dispatchEvent({name="onRobotlegsViewCreated", target=self})
		end

		function view:destroy()
			self.buttonstage2:remove()
			Runtime:dispatchEvent({name="onRobotlegsViewDestroyed", target=self})
			self:removeSelf()
		end

	view:init()
	return view
end
return viewA
