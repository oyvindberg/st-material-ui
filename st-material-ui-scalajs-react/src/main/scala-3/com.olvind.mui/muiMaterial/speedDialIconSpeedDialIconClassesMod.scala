package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object speedDialIconSpeedDialIconClassesMod {
  
  @JSImport("@mui/material/SpeedDialIcon/speedDialIconClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/SpeedDialIcon/speedDialIconClasses", JSImport.Default)
  @js.native
  val default: SpeedDialIconClasses = js.native
  
  inline def getSpeedDialIconUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpeedDialIconUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type SpeedDialIconClassKey = "root" | "icon" | "iconOpen" | "iconWithOpenIconOpen" | "openIcon" | "openIconOpen"
  
  trait SpeedDialIconClasses extends StObject {
    
    /** Styles applied to the icon component. */
    var icon: String
    
    /** Styles applied to the icon component if `open={true}`. */
    var iconOpen: String
    
    /** Styles applied to the icon when an `openIcon` is provided and if `open={true}`. */
    var iconWithOpenIconOpen: String
    
    /** Styles applied to the `openIcon` if provided. */
    var openIcon: String
    
    /** Styles applied to the `openIcon` if provided and if `open={true}`. */
    var openIconOpen: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object SpeedDialIconClasses {
    
    inline def apply(
      icon: String,
      iconOpen: String,
      iconWithOpenIconOpen: String,
      openIcon: String,
      openIconOpen: String,
      root: String
    ): SpeedDialIconClasses = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], iconOpen = iconOpen.asInstanceOf[js.Any], iconWithOpenIconOpen = iconWithOpenIconOpen.asInstanceOf[js.Any], openIcon = openIcon.asInstanceOf[js.Any], openIconOpen = openIconOpen.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpeedDialIconClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpeedDialIconClasses] (val x: Self) extends AnyVal {
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconOpen(value: String): Self = StObject.set(x, "iconOpen", value.asInstanceOf[js.Any])
      
      inline def setIconWithOpenIconOpen(value: String): Self = StObject.set(x, "iconWithOpenIconOpen", value.asInstanceOf[js.Any])
      
      inline def setOpenIcon(value: String): Self = StObject.set(x, "openIcon", value.asInstanceOf[js.Any])
      
      inline def setOpenIconOpen(value: String): Self = StObject.set(x, "openIconOpen", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
