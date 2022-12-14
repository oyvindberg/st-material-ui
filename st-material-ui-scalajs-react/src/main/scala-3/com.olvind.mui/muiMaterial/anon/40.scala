package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `40` extends StObject {
  
  var additionalAvatar: js.UndefOr[ComponentPropsWithRefOverridableComponen] = js.undefined
}
object `40` {
  
  inline def apply(): `40` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`40`]
  }
  
  extension [Self <: `40`](x: Self) {
    
    inline def setAdditionalAvatar(value: ComponentPropsWithRefOverridableComponen): Self = StObject.set(x, "additionalAvatar", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAvatarUndefined: Self = StObject.set(x, "additionalAvatar", js.undefined)
  }
}
