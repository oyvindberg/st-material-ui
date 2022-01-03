package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `26` extends StObject {
  
  /* you can set this property to change the underlying component. keep in mind that the types of callbacks may be different */
  val component: js.UndefOr[String] = js.native
}
object `26` {
  
  @scala.inline
  def apply(): `26` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`26`]
  }
  
  @scala.inline
  implicit class `26MutableBuilder`[Self <: `26`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
