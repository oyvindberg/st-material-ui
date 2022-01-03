package com.olvind.mui.emotionStyled.anon

import com.olvind.mui.react.mod.ComponentProps
import com.olvind.mui.std.InstanceType
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref[C /* <: ReactComponentClass[ComponentProps[C]] */] extends StObject {
  
  var ref: js.UndefOr[com.olvind.mui.react.mod.Ref[InstanceType[C]]] = js.undefined
}
object Ref {
  
  inline def apply[C /* <: ReactComponentClass[ComponentProps[C]] */](): Ref[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ref[C]]
  }
  
  extension [Self <: Ref[?], C /* <: ReactComponentClass[ComponentProps[C]] */](x: Self & Ref[C]) {
    
    inline def setRef(value: com.olvind.mui.react.mod.Ref[InstanceType[C]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ InstanceType[C] | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefReactRef(value: ReactRef[InstanceType[C]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
