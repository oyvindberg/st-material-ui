package com.olvind.mui.muiStyledEngine

import com.olvind.mui.react.mod.ComponentProps
import com.olvind.mui.std.InstanceType
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ref[C /* <: ReactComponentClass[ComponentProps[C]] */] extends StObject {
    
    var ref: js.UndefOr[com.olvind.mui.react.mod.Ref[InstanceType[C]]] = js.undefined
  }
  object Ref {
    
    inline def apply[C /* <: ReactComponentClass[ComponentProps[C]] */](): Ref[C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ref[C]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ref[?], C /* <: ReactComponentClass[ComponentProps[C]] */] (val x: Self & Ref[C]) extends AnyVal {
      
      inline def setRef(value: com.olvind.mui.react.mod.Ref[InstanceType[C]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ InstanceType[C] | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefReactRef(value: ReactRef[InstanceType[C]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Theme[?], T /* <: js.Object */] (val x: Self & Theme[T]) extends AnyVal {
      
      inline def setTheme(value: T): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
