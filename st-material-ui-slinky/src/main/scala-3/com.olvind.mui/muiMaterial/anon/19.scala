package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19`[SecondaryTypographyComponent /* <: ReactElement */] extends StObject {
  
  var component: js.UndefOr[SecondaryTypographyComponent] = js.undefined
}
object `19` {
  
  inline def apply[SecondaryTypographyComponent /* <: ReactElement */](): `19`[SecondaryTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`19`[SecondaryTypographyComponent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `19`[?], SecondaryTypographyComponent /* <: ReactElement */] (val x: Self & `19`[SecondaryTypographyComponent]) extends AnyVal {
    
    inline def setComponent(value: SecondaryTypographyComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
