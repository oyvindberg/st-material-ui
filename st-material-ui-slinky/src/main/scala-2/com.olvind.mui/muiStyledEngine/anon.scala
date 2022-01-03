package com.olvind.mui.muiStyledEngine

import com.olvind.mui.react.mod.ComponentProps
import com.olvind.mui.std.InstanceType
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Ref[C /* <: ReactComponentClass[ComponentProps[C]] */] extends StObject {
    
    var ref: js.UndefOr[com.olvind.mui.react.mod.Ref[InstanceType[C]]] = js.native
  }
  object Ref {
    
    @scala.inline
    def apply[C /* <: ReactComponentClass[ComponentProps[C]] */](): Ref[C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ref[C]]
    }
    
    @scala.inline
    implicit class RefMutableBuilder[Self <: Ref[_], C /* <: ReactComponentClass[ComponentProps[C]] */] (val x: Self with Ref[C]) extends AnyVal {
      
      @scala.inline
      def setRef(value: com.olvind.mui.react.mod.Ref[InstanceType[C]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ InstanceType[C] | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefReactRef(value: ReactRef[InstanceType[C]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  @js.native
  trait Theme[T /* <: js.Object */] extends StObject {
    
    var theme: T = js.native
  }
  object Theme {
    
    @scala.inline
    def apply[T /* <: js.Object */](theme: T): Theme[T] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme[T]]
    }
    
    @scala.inline
    implicit class ThemeMutableBuilder[Self <: Theme[_], T /* <: js.Object */] (val x: Self with Theme[T]) extends AnyVal {
      
      @scala.inline
      def setTheme(value: T): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
