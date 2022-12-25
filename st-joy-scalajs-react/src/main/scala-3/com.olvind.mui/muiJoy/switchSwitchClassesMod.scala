package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchSwitchClassesMod {
  
  @JSImport("@mui/joy/Switch/switchClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Switch/switchClasses", JSImport.Default)
  @js.native
  val default: SwitchClasses = js.native
  
  inline def getSwitchUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSwitchUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type SwitchClassKey = "root" | "checked" | "disabled" | "action" | "input" | "thumb" | "track" | "focusVisible" | "readOnly" | "colorPrimary" | "colorDanger" | "colorInfo" | "colorSuccess" | "colorWarning" | "sizeSm" | "sizeMd" | "sizeLg" | "variantOutlined" | "variantSoft" | "variantSolid" | "startDecorator" | "endDecorator"
  
  trait SwitchClasses extends StObject {
    
    /** Styles applied to the action element. */
    var action: String
    
    /** State class applied to the root `checked` class. */
    var checked: String
    
    /** Styles applied to the root element if `color="danger"`. */
    var colorDanger: String
    
    /** Styles applied to the root element if `color="info"`. */
    var colorInfo: String
    
    /** Styles applied to the root element if `color="primary"`. */
    var colorPrimary: String
    
    /** Styles applied to the root element if `color="success"`. */
    var colorSuccess: String
    
    /** Styles applied to the root element if `color="warning"`. */
    var colorWarning: String
    
    /** State class applied to the root disabled class. */
    var disabled: String
    
    /** Styles applied to the endDecorator element. */
    var endDecorator: String
    
    /** Class applied to the root element if the switch has visible focus */
    var focusVisible: String
    
    /** Styles applied to the input element. */
    var input: String
    
    /** Class applied to the root element if the switch is read-only */
    var readOnly: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `size="lg"`. */
    var sizeLg: String
    
    /** Styles applied to the root element if `size="md"`. */
    var sizeMd: String
    
    /** Styles applied to the root element if `size="sm"`. */
    var sizeSm: String
    
    /** Styles applied to the startDecorator element. */
    var startDecorator: String
    
    /** Styles Styles applied to the input element. */
    var thumb: String
    
    /** Styles applied to the track element. */
    var track: String
    
    /** Styles applied to the root element if `variant="outlined"`. */
    var variantOutlined: String
    
    /** Styles applied to the root element if `variant="soft"`. */
    var variantSoft: String
    
    /** Styles applied to the root element if `variant="solid"`. */
    var variantSolid: String
  }
  object SwitchClasses {
    
    inline def apply(
      action: String,
      checked: String,
      colorDanger: String,
      colorInfo: String,
      colorPrimary: String,
      colorSuccess: String,
      colorWarning: String,
      disabled: String,
      endDecorator: String,
      focusVisible: String,
      input: String,
      readOnly: String,
      root: String,
      sizeLg: String,
      sizeMd: String,
      sizeSm: String,
      startDecorator: String,
      thumb: String,
      track: String,
      variantOutlined: String,
      variantSoft: String,
      variantSolid: String
    ): SwitchClasses = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], checked = checked.asInstanceOf[js.Any], colorDanger = colorDanger.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], endDecorator = endDecorator.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeLg = sizeLg.asInstanceOf[js.Any], sizeMd = sizeMd.asInstanceOf[js.Any], sizeSm = sizeSm.asInstanceOf[js.Any], startDecorator = startDecorator.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], variantOutlined = variantOutlined.asInstanceOf[js.Any], variantSoft = variantSoft.asInstanceOf[js.Any], variantSolid = variantSolid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwitchClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwitchClasses] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setColorDanger(value: String): Self = StObject.set(x, "colorDanger", value.asInstanceOf[js.Any])
      
      inline def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      inline def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setEndDecorator(value: String): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: String): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSizeLg(value: String): Self = StObject.set(x, "sizeLg", value.asInstanceOf[js.Any])
      
      inline def setSizeMd(value: String): Self = StObject.set(x, "sizeMd", value.asInstanceOf[js.Any])
      
      inline def setSizeSm(value: String): Self = StObject.set(x, "sizeSm", value.asInstanceOf[js.Any])
      
      inline def setStartDecorator(value: String): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
      
      inline def setThumb(value: String): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      inline def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      inline def setVariantOutlined(value: String): Self = StObject.set(x, "variantOutlined", value.asInstanceOf[js.Any])
      
      inline def setVariantSoft(value: String): Self = StObject.set(x, "variantSoft", value.asInstanceOf[js.Any])
      
      inline def setVariantSolid(value: String): Self = StObject.set(x, "variantSolid", value.asInstanceOf[js.Any])
    }
  }
}
