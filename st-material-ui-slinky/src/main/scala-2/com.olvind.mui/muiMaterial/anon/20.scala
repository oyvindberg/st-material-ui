package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `20`[P, D /* <: ReactElement */] extends StObject {
  
  var defaultComponent: D = js.native
  
  var props: P with AutoFocus = js.native
}
object `20` {
  
  @scala.inline
  def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P with AutoFocus): `20`[P, D] = {
    val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20`[P, D]]
  }
  
  @scala.inline
  implicit class `20MutableBuilder`[Self <: `20`[_, _], P, D /* <: ReactElement */] (val x: Self with (`20`[P, D])) extends AnyVal {
    
    @scala.inline
    def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: P with AutoFocus): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
