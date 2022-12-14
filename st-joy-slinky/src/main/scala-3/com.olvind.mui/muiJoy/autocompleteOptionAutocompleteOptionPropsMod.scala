package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.AutocompleteOptionPropsAutocompleteOptio
import com.olvind.mui.muiJoy.anon.ColorSx
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ApplyColorInversion
import com.olvind.mui.muiTypes.mod.OverrideProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompleteOptionAutocompleteOptionPropsMod {
  
  type AutocompleteOptionOwnerState = ApplyColorInversion[AutocompleteOptionPropsAutocompleteOptio]
  
  type AutocompleteOptionProps[D /* <: ReactElement */, P] = OverrideProps[AutocompleteOptionTypeMap[P, D], D]
  
  trait AutocompleteOptionPropsColorOverrides extends StObject
  
  trait AutocompleteOptionPropsVariantOverrides extends StObject
  
  type AutocompleteOptionSlot = "root"
  
  trait AutocompleteOptionTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & ColorSx
  }
  object AutocompleteOptionTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & ColorSx): AutocompleteOptionTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteOptionTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutocompleteOptionTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (AutocompleteOptionTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & ColorSx): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
