package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `7`[TitleTypographyComponent /* <: ReactElement */] extends StObject {
  
  var component: js.UndefOr[TitleTypographyComponent] = js.native
}
object `7` {
  
  @scala.inline
  def apply[TitleTypographyComponent /* <: ReactElement */](): `7`[TitleTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`7`[TitleTypographyComponent]]
  }
  
  @scala.inline
  implicit class `7MutableBuilder`[Self <: `7`[_], TitleTypographyComponent /* <: ReactElement */] (val x: Self with `7`[TitleTypographyComponent]) extends AnyVal {
    
    @scala.inline
    def setComponent(value: TitleTypographyComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
