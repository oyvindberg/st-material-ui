package com.olvind.mui.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var media: js.UndefOr[String] = js.undefined
  
  var scoped: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object StyleHTMLAttributes {
  
  inline def apply[T](): StyleHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleHTMLAttributes[?], T] (val x: Self & StyleHTMLAttributes[T]) extends AnyVal {
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
    
    inline def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
