package com.olvind.mui.emotionStyled.anon

import com.olvind.mui.react.mod.ComponentProps
import com.olvind.mui.std.InstanceType
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ref[C /* <: ComponentClassP[ComponentProps[C] with js.Object] */] extends StObject {
  
  var ref: js.UndefOr[com.olvind.mui.react.mod.Ref[InstanceType[C]]] = js.native
}
object Ref {
  
  @scala.inline
  def apply[C /* <: ComponentClassP[ComponentProps[C] with js.Object] */](): Ref[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ref[C]]
  }
  
  @scala.inline
  implicit class RefMutableBuilder[Self <: Ref[_], C /* <: ComponentClassP[ComponentProps[C] with js.Object] */] (val x: Self with Ref[C]) extends AnyVal {
    
    @scala.inline
    def setRef(value: com.olvind.mui.react.mod.Ref[InstanceType[C]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: InstanceType[C] | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: InstanceType[C] | Null) => value(t0).runNow()))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
