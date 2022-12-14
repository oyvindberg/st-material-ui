package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeSelectNativeSelectClassesMod {
  
  @JSImport("@mui/material/NativeSelect/nativeSelectClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/NativeSelect/nativeSelectClasses", JSImport.Default)
  @js.native
  val default: NativeSelectClasses = js.native
  
  inline def getNativeSelectUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNativeSelectUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type NativeSelectClassKey = "root" | "select" | "multiple" | "filled" | "outlined" | "standard" | "disabled" | "icon" | "iconOpen" | "iconFilled" | "iconOutlined" | "iconStandard" | "nativeInput" | "error"
  
  trait NativeSelectClasses extends StObject {
    
    /** State class applied to the select component `disabled` class. */
    var disabled: String
    
    /** State class applied to the select component `error` class. */
    var error: String
    
    /** Styles applied to the select component if `variant="filled"`. */
    var filled: String
    
    /** Styles applied to the icon component. */
    var icon: String
    
    /** Styles applied to the icon component if `variant="filled"`. */
    var iconFilled: String
    
    /** Styles applied to the icon component if the popup is open. */
    var iconOpen: String
    
    /** Styles applied to the icon component if `variant="outlined"`. */
    var iconOutlined: String
    
    /** Styles applied to the icon component if `variant="standard"`. */
    var iconStandard: String
    
    /** Styles applied to the select component if `multiple={true}`. */
    var multiple: String
    
    /** Styles applied to the underlying native input component. */
    var nativeInput: String
    
    /** Styles applied to the select component if `variant="outlined"`. */
    var outlined: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the select component `select` class. */
    var select: String
    
    /** Styles applied to the select component if `variant="standard"`. */
    var standard: String
  }
  object NativeSelectClasses {
    
    inline def apply(
      disabled: String,
      error: String,
      filled: String,
      icon: String,
      iconFilled: String,
      iconOpen: String,
      iconOutlined: String,
      iconStandard: String,
      multiple: String,
      nativeInput: String,
      outlined: String,
      root: String,
      select: String,
      standard: String
    ): NativeSelectClasses = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconFilled = iconFilled.asInstanceOf[js.Any], iconOpen = iconOpen.asInstanceOf[js.Any], iconOutlined = iconOutlined.asInstanceOf[js.Any], iconStandard = iconStandard.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], nativeInput = nativeInput.asInstanceOf[js.Any], outlined = outlined.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeSelectClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeSelectClasses] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFilled(value: String): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFilled(value: String): Self = StObject.set(x, "iconFilled", value.asInstanceOf[js.Any])
      
      inline def setIconOpen(value: String): Self = StObject.set(x, "iconOpen", value.asInstanceOf[js.Any])
      
      inline def setIconOutlined(value: String): Self = StObject.set(x, "iconOutlined", value.asInstanceOf[js.Any])
      
      inline def setIconStandard(value: String): Self = StObject.set(x, "iconStandard", value.asInstanceOf[js.Any])
      
      inline def setMultiple(value: String): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setNativeInput(value: String): Self = StObject.set(x, "nativeInput", value.asInstanceOf[js.Any])
      
      inline def setOutlined(value: String): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    }
  }
}
