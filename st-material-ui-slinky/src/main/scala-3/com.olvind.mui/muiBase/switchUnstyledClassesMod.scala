package com.olvind.mui.muiBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchUnstyledClassesMod {
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.root
    - `com.olvind.mui`.muiBase.muiBaseStrings.input
    - `com.olvind.mui`.muiBase.muiBaseStrings.track
    - `com.olvind.mui`.muiBase.muiBaseStrings.thumb
    - `com.olvind.mui`.muiBase.muiBaseStrings.checked
    - `com.olvind.mui`.muiBase.muiBaseStrings.disabled
    - `com.olvind.mui`.muiBase.muiBaseStrings.focusVisible
    - `com.olvind.mui`.muiBase.muiBaseStrings.readOnly
  */
  trait SwitchUnstyledClassKey extends StObject
  
  trait SwitchUnstyledClasses extends StObject {
    
    /** Class applied to the root element if the switch is checked */
    var checked: String
    
    /** Class applied to the root element if the switch is disabled */
    var disabled: String
    
    /** Class applied to the root element if the switch has visible focus */
    var focusVisible: String
    
    /** Class applied to the internal input element */
    var input: String
    
    /** Class applied to the root element if the switch is read-only */
    var readOnly: String
    
    /** Class applied to the root element. */
    var root: String
    
    /** Class applied to the thumb element */
    var thumb: String
    
    /** Class applied to the track element */
    var track: String
  }
  object SwitchUnstyledClasses {
    
    inline def apply(
      checked: String,
      disabled: String,
      focusVisible: String,
      input: String,
      readOnly: String,
      root: String,
      thumb: String,
      track: String
    ): SwitchUnstyledClasses = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwitchUnstyledClasses]
    }
    
    extension [Self <: SwitchUnstyledClasses](x: Self) {
      
      inline def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: String): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setThumb(value: String): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      inline def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    }
  }
}
