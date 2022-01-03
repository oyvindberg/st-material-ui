package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeSelectClassesMod {
  
  @JSImport("@mui/material/NativeSelect/nativeSelectClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/NativeSelect/nativeSelectClasses", JSImport.Default)
  @js.native
  val default: NativeSelectClasses = js.native
  
  @scala.inline
  def getNativeSelectUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNativeSelectUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.select
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.multiple
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.filled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.outlined
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.standard
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.icon
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.iconOpen
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.iconFilled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.iconOutlined
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.iconStandard
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.nativeInput
  */
  trait NativeSelectClassKey extends StObject
  
  @js.native
  trait NativeSelectClasses extends StObject {
    
    /** State class applied to the select component `disabled` class. */
    var disabled: String = js.native
    
    /** Styles applied to the select component if `variant="filled"`. */
    var filled: String = js.native
    
    /** Styles applied to the icon component. */
    var icon: String = js.native
    
    /** Styles applied to the icon component if `variant="filled"`. */
    var iconFilled: String = js.native
    
    /** Styles applied to the icon component if the popup is open. */
    var iconOpen: String = js.native
    
    /** Styles applied to the icon component if `variant="outlined"`. */
    var iconOutlined: String = js.native
    
    /** Styles applied to the icon component if `variant="standard"`. */
    var iconStandard: String = js.native
    
    /** Styles applied to the select component if `multiple={true}`. */
    var multiple: String = js.native
    
    /** Styles applied to the underlying native input component. */
    var nativeInput: String = js.native
    
    /** Styles applied to the select component if `variant="outlined"`. */
    var outlined: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the select component `select` class. */
    var select: String = js.native
    
    /** Styles applied to the select component if `variant="standard"`. */
    var standard: String = js.native
  }
  object NativeSelectClasses {
    
    @scala.inline
    def apply(
      disabled: String,
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
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconFilled = iconFilled.asInstanceOf[js.Any], iconOpen = iconOpen.asInstanceOf[js.Any], iconOutlined = iconOutlined.asInstanceOf[js.Any], iconStandard = iconStandard.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], nativeInput = nativeInput.asInstanceOf[js.Any], outlined = outlined.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeSelectClasses]
    }
    
    @scala.inline
    implicit class NativeSelectClassesMutableBuilder[Self <: NativeSelectClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilled(value: String): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFilled(value: String): Self = StObject.set(x, "iconFilled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconOpen(value: String): Self = StObject.set(x, "iconOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconOutlined(value: String): Self = StObject.set(x, "iconOutlined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconStandard(value: String): Self = StObject.set(x, "iconStandard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiple(value: String): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeInput(value: String): Self = StObject.set(x, "nativeInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlined(value: String): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    }
  }
}
