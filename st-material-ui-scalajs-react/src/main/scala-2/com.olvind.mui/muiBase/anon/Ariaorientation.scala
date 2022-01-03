package com.olvind.mui.muiBase.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ariaorientation extends StObject {
  
  var `aria-label`: js.UndefOr[String] = js.native
  
  var `aria-labelledby`: js.UndefOr[String] = js.native
  
  var `aria-orientation`: String | Null = js.native
  
  var ref: com.olvind.mui.react.mod.Ref[Any] = js.native
  
  var role: String = js.native
}
object Ariaorientation {
  
  @scala.inline
  def apply(role: String): Ariaorientation = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], ref = null)
    __obj.updateDynamic("aria-orientation")(null)
    __obj.asInstanceOf[Ariaorientation]
  }
  
  @scala.inline
  implicit class AriaorientationMutableBuilder[Self <: Ariaorientation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    @scala.inline
    def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    @scala.inline
    def `setAria-orientation`(value: String): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-orientationNull`: Self = StObject.set(x, "aria-orientation", null)
    
    @scala.inline
    def setRef(value: com.olvind.mui.react.mod.Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
