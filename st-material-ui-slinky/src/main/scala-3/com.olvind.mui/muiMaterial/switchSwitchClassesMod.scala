package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchSwitchClassesMod {
  
  @JSImport("@mui/material/Switch/switchClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Switch/switchClasses", JSImport.Default)
  @js.native
  val default: SwitchClasses = js.native
  
  inline def getSwitchUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSwitchUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type SwitchClassKey = "root" | "edgeStart" | "edgeEnd" | "switchBase" | "colorPrimary" | "colorSecondary" | "sizeSmall" | "sizeMedium" | "checked" | "disabled" | "input" | "thumb" | "track"
  
  trait SwitchClasses extends StObject {
    
    /** State class applied to the internal `SwitchBase` component's `checked` class. */
    var checked: String
    
    /** Styles applied to the internal SwitchBase component's root element if `color="primary"`. */
    var colorPrimary: String
    
    /** Styles applied to the internal SwitchBase component's root element if `color="secondary"`. */
    var colorSecondary: String
    
    /** State class applied to the internal SwitchBase component's disabled class. */
    var disabled: String
    
    /** Styles applied to the root element if `edge="end"`. */
    var edgeEnd: String
    
    /** Styles applied to the root element if `edge="start"`. */
    var edgeStart: String
    
    /** Styles applied to the internal SwitchBase component's input element. */
    var input: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `size="medium"`. */
    var sizeMedium: String
    
    /** Styles applied to the root element if `size="small"`. */
    var sizeSmall: String
    
    /** Styles applied to the internal `SwitchBase` component's `root` class. */
    var switchBase: String
    
    /** Styles used to create the thumb passed to the internal `SwitchBase` component `icon` prop. */
    var thumb: String
    
    /** Styles applied to the track element. */
    var track: String
  }
  object SwitchClasses {
    
    inline def apply(
      checked: String,
      colorPrimary: String,
      colorSecondary: String,
      disabled: String,
      edgeEnd: String,
      edgeStart: String,
      input: String,
      root: String,
      sizeMedium: String,
      sizeSmall: String,
      switchBase: String,
      thumb: String,
      track: String
    ): SwitchClasses = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSecondary = colorSecondary.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], edgeEnd = edgeEnd.asInstanceOf[js.Any], edgeStart = edgeStart.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeMedium = sizeMedium.asInstanceOf[js.Any], sizeSmall = sizeSmall.asInstanceOf[js.Any], switchBase = switchBase.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwitchClasses]
    }
    
    extension [Self <: SwitchClasses](x: Self) {
      
      inline def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setEdgeEnd(value: String): Self = StObject.set(x, "edgeEnd", value.asInstanceOf[js.Any])
      
      inline def setEdgeStart(value: String): Self = StObject.set(x, "edgeStart", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSizeMedium(value: String): Self = StObject.set(x, "sizeMedium", value.asInstanceOf[js.Any])
      
      inline def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
      
      inline def setSwitchBase(value: String): Self = StObject.set(x, "switchBase", value.asInstanceOf[js.Any])
      
      inline def setThumb(value: String): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      inline def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    }
  }
}
