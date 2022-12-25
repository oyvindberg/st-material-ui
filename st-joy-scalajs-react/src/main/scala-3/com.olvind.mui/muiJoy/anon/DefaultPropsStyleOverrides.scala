package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.autocompleteAutocompletePropsMod.AutocompleteOwnerState
import com.olvind.mui.muiJoy.autocompleteAutocompletePropsMod.AutocompleteSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultPropsStyleOverrides[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialAutocompletePropsanyanyanyany] = js.undefined
  
  var styleOverrides: js.UndefOr[
    OverridesStyleRules[AutocompleteSlot, AutocompleteOwnerState[Any, Any, Any, Any], Theme]
  ] = js.undefined
}
object DefaultPropsStyleOverrides {
  
  inline def apply[Theme](): DefaultPropsStyleOverrides[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultPropsStyleOverrides[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultPropsStyleOverrides[?], Theme] (val x: Self & DefaultPropsStyleOverrides[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialAutocompletePropsanyanyanyany): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[AutocompleteSlot, AutocompleteOwnerState[Any, Any, Any, Any], Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
