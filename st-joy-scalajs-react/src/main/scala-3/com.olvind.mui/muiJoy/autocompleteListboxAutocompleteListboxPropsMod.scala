package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.AutocompleteListboxPropsAutocompleteList
import com.olvind.mui.muiJoy.anon.Sx
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.ApplyColorInversion
import com.olvind.mui.muiTypes.mod.OverrideProps
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompleteListboxAutocompleteListboxPropsMod {
  
  type AutocompleteListboxOwnerState = ApplyColorInversion[AutocompleteListboxPropsAutocompleteList]
  
  type AutocompleteListboxProps[D /* <: ElementType */, P] = OverrideProps[AutocompleteListboxTypeMap[P, D], D]
  
  trait AutocompleteListboxPropsColorOverrides extends StObject
  
  trait AutocompleteListboxPropsSizeOverrides extends StObject
  
  trait AutocompleteListboxPropsVariantOverrides extends StObject
  
  type AutocompleteListboxSlot = "root"
  
  trait AutocompleteListboxTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Sx
  }
  object AutocompleteListboxTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & Sx): AutocompleteListboxTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteListboxTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutocompleteListboxTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (AutocompleteListboxTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Sx): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
