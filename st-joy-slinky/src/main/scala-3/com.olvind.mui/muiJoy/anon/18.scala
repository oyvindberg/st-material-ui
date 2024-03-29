package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.containerContainerPropsMod.ContainerSlot
import com.olvind.mui.muiJoy.stylesComponentsMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialContainerPropsContainerTypeMapdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[
    OverridesStyleRules[ContainerSlot, ContainerPropsContainerTypeMapdivdefault, Theme]
  ] = js.undefined
}
object `18` {
  
  inline def apply[Theme](): `18`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`18`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `18`[?], Theme] (val x: Self & `18`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialContainerPropsContainerTypeMapdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: OverridesStyleRules[ContainerSlot, ContainerPropsContainerTypeMapdivdefault, Theme]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
  }
}
