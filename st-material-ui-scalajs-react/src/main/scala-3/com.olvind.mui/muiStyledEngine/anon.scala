package com.olvind.mui.muiStyledEngine

import com.olvind.mui.react.mod.ComponentProps
import com.olvind.mui.std.InstanceType
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ref[C /* <: ComponentClassP[ComponentProps[C] & js.Object] */] extends StObject {
    
    var ref: js.UndefOr[com.olvind.mui.react.mod.Ref[InstanceType[C]]] = js.undefined
  }
  object Ref {
    
    inline def apply[C /* <: ComponentClassP[ComponentProps[C] & js.Object] */](): Ref[C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ref[C]]
    }
    
    extension [Self <: Ref[?], C /* <: ComponentClassP[ComponentProps[C] & js.Object] */](x: Self & Ref[C]) {
      
      inline def setRef(value: com.olvind.mui.react.mod.Ref[InstanceType[C]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: InstanceType[C] | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: InstanceType[C] | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait Theme[T /* <: js.Object */] extends StObject {
    
    var theme: T
  }
  object Theme {
    
    inline def apply[T /* <: js.Object */](theme: T): Theme[T] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme[T]]
    }
    
    extension [Self <: Theme[?], T /* <: js.Object */](x: Self & Theme[T]) {
      
      inline def setTheme(value: T): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
