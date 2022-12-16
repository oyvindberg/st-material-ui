package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object speedDialSpeedDialClassesMod {
  
  @JSImport("@mui/material/SpeedDial/speedDialClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/SpeedDial/speedDialClasses", JSImport.Default)
  @js.native
  val default: SpeedDialClasses = js.native
  
  inline def getSpeedDialUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpeedDialUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type SpeedDialClassKey = "root" | "fab" | "directionUp" | "directionDown" | "directionLeft" | "directionRight" | "actions" | "actionsClosed"
  
  trait SpeedDialClasses extends StObject {
    
    /** Styles applied to the actions (`children` wrapper) element. */
    var actions: String
    
    /** Styles applied to the actions (`children` wrapper) element if `open={false}`. */
    var actionsClosed: String
    
    /** Styles applied to the root element if direction="down" */
    var directionDown: String
    
    /** Styles applied to the root element if direction="left" */
    var directionLeft: String
    
    /** Styles applied to the root element if direction="right" */
    var directionRight: String
    
    /** Styles applied to the root element if direction="up" */
    var directionUp: String
    
    /** Styles applied to the Fab component. */
    var fab: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object SpeedDialClasses {
    
    inline def apply(
      actions: String,
      actionsClosed: String,
      directionDown: String,
      directionLeft: String,
      directionRight: String,
      directionUp: String,
      fab: String,
      root: String
    ): SpeedDialClasses = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], actionsClosed = actionsClosed.asInstanceOf[js.Any], directionDown = directionDown.asInstanceOf[js.Any], directionLeft = directionLeft.asInstanceOf[js.Any], directionRight = directionRight.asInstanceOf[js.Any], directionUp = directionUp.asInstanceOf[js.Any], fab = fab.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpeedDialClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpeedDialClasses] (val x: Self) extends AnyVal {
      
      inline def setActions(value: String): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsClosed(value: String): Self = StObject.set(x, "actionsClosed", value.asInstanceOf[js.Any])
      
      inline def setDirectionDown(value: String): Self = StObject.set(x, "directionDown", value.asInstanceOf[js.Any])
      
      inline def setDirectionLeft(value: String): Self = StObject.set(x, "directionLeft", value.asInstanceOf[js.Any])
      
      inline def setDirectionRight(value: String): Self = StObject.set(x, "directionRight", value.asInstanceOf[js.Any])
      
      inline def setDirectionUp(value: String): Self = StObject.set(x, "directionUp", value.asInstanceOf[js.Any])
      
      inline def setFab(value: String): Self = StObject.set(x, "fab", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
