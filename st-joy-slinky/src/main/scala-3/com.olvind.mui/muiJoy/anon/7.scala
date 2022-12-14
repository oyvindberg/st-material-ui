package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.boxBoxPropsMod.BoxSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialBoxPropsBoxTypeMapdivThemedefault] = js.undefined
  
  var styleOverrides: js.UndefOr[OverridesStyleRules[BoxSlot, BoxPropsBoxTypeMapdivThemedefaultCompone, Theme]] = js.undefined
}
object `7` {
  
  inline def apply[Theme](): `7`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`7`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `7`[?], Theme] (val x: Self & `7`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialBoxPropsBoxTypeMapdivThemedefault): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[BoxSlot, BoxPropsBoxTypeMapdivThemedefaultCompone, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
