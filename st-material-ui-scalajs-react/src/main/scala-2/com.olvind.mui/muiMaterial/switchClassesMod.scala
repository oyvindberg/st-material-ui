package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchClassesMod {
  
  @JSImport("@mui/material/Switch/switchClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Switch/switchClasses", JSImport.Default)
  @js.native
  val default: SwitchClasses = js.native
  
  @scala.inline
  def getSwitchUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSwitchUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.edgeStart
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.edgeEnd
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.switchBase
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorPrimary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorSecondary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.sizeSmall
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.sizeMedium
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.checked
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.input
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.thumb
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.track
  */
  trait SwitchClassKey extends StObject
  
  @js.native
  trait SwitchClasses extends StObject {
    
    /** State class applied to the internal `SwitchBase` component's `checked` class. */
    var checked: String = js.native
    
    /** Styles applied to the internal SwitchBase component's root element if `color="primary"`. */
    var colorPrimary: String = js.native
    
    /** Styles applied to the internal SwitchBase component's root element if `color="secondary"`. */
    var colorSecondary: String = js.native
    
    /** State class applied to the internal SwitchBase component's disabled class. */
    var disabled: String = js.native
    
    /** Styles applied to the root element if `edge="end"`. */
    var edgeEnd: String = js.native
    
    /** Styles applied to the root element if `edge="start"`. */
    var edgeStart: String = js.native
    
    /** Styles applied to the internal SwitchBase component's input element. */
    var input: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the root element if `size="medium"`. */
    var sizeMedium: String = js.native
    
    /** Styles applied to the root element if `size="small"`. */
    var sizeSmall: String = js.native
    
    /** Styles applied to the internal `SwitchBase` component's `root` class. */
    var switchBase: String = js.native
    
    /** Styles used to create the thumb passed to the internal `SwitchBase` component `icon` prop. */
    var thumb: String = js.native
    
    /** Styles applied to the track element. */
    var track: String = js.native
  }
  object SwitchClasses {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class SwitchClassesMutableBuilder[Self <: SwitchClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeEnd(value: String): Self = StObject.set(x, "edgeEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeStart(value: String): Self = StObject.set(x, "edgeStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeMedium(value: String): Self = StObject.set(x, "sizeMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitchBase(value: String): Self = StObject.set(x, "switchBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumb(value: String): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    }
  }
}
