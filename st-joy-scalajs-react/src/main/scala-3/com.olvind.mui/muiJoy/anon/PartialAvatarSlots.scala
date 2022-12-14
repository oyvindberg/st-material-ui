package com.olvind.mui.muiJoy.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/joy.@mui/joy/Avatar/AvatarProps.AvatarSlots> */
trait PartialAvatarSlots extends StObject {
  
  var fallback: js.UndefOr[ElementType] = js.undefined
  
  var img: js.UndefOr[ElementType] = js.undefined
  
  var root: js.UndefOr[ElementType] = js.undefined
}
object PartialAvatarSlots {
  
  inline def apply(): PartialAvatarSlots = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAvatarSlots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialAvatarSlots] (val x: Self) extends AnyVal {
    
    inline def setFallback(value: ElementType): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setImg(value: ElementType): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
    
    inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
