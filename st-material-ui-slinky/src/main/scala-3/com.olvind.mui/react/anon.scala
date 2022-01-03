package com.olvind.mui.react

import com.olvind.mui.std.Exclude
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `1` extends StObject {
    
    var ref: js.UndefOr[Exclude[Any, String]] = js.undefined
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setRef(value: Exclude[Any, String]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait Html extends StObject {
    
    var __html: String
  }
  object Html {
    
    inline def apply(__html: String): Html = {
      val __obj = js.Dynamic.literal(__html = __html.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html]
    }
    
    extension [Self <: Html](x: Self) {
      
      inline def set__html(value: String): Self = StObject.set(x, "__html", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UNDEFINEDVOIDONLY extends StObject
}
