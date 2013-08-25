require("config")
require("rapanui-sdk.rapanui")

require("eventHandler")
Runtime = eventHandler:new()

local function startThisMug()
  RNMainThread.removeAction(actionId)
	local function bootstrap()
		require "Application"
		local app = Application:new()

		function showProps(o)
			print("-- showProps --")
			print("o: ", o)
			for key,value in pairs(o) do
				print("key: ", key, ", value: ", value);
			end
			print("-- end showProps --")
		end

	end

	bootstrap()
end

local function onError(e)
	return true
end


function evtHallo(event)
  print ("hallo--------------------------------", event.target)
  
end

function evtDuda(event)
  print ("duda")
end


Runtime:addEventListener("unhandledError", onError)
actionId = RNMainThread.addTimedAction(0.5, startThisMug)