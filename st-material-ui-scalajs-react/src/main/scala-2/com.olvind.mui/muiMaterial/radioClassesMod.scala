package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioClassesMod {
  
  @JSImport("@mui/material/Radio/radioClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Radio/radioClasses", JSImport.Default)
  @js.native
  val default: RadioClasses = js.native
  
  @scala.inline
  def getRadioUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRadioUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.checked
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorPrimary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorSecondary
  */
  trait RadioClassKey extends StObject
  
  @js.native
  trait RadioClasses extends StObject {
    
    /** State class applied to the root element if `checked={true}`. */
    var checked: String = js.native
    
    /** Styles applied to the root element if `color="primary"`. */
    var colorPrimary: String = js.native
    
    /** Styles applied to the root element if `color="secondary"`. */
    var colorSecondary: String = js.native
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object RadioClasses {
    
    @scala.inline
    def apply(checked: String, colorPrimary: String, colorSecondary: String, disabled: String, root: String): RadioClasses = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSecondary = colorSecondary.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioClasses]
    }
    
    @scala.inline
    implicit class RadioClassesMutableBuilder[Self <: RadioClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
