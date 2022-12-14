package com.olvind.mui.muiJoy.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/joy.@mui/joy/Avatar/AvatarProps.AvatarSlots> */
trait PartialAvatarSlots extends StObject {
  
  var fallback: js.UndefOr[ReactElement] = js.undefined
  
  var img: js.UndefOr[ReactElement] = js.undefined
  
  var root: js.UndefOr[ReactElement] = js.undefined
}
object PartialAvatarSlots {
  
  inline def apply(): PartialAvatarSlots = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAvatarSlots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialAvatarSlots] (val x: Self) extends AnyVal {
    
    inline def setFallback(value: ReactElement): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setImg(value: ReactElement): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
    
    inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
    
    inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
