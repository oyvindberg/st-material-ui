package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/styles/experimental_extendTheme.PaletteBackgroundChannel> */
trait PartialPaletteBackgroundChannel extends StObject {
  
  var defaultChannel: js.UndefOr[String] = js.undefined
}
object PartialPaletteBackgroundChannel {
  
  inline def apply(): PartialPaletteBackgroundChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaletteBackgroundChannel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPaletteBackgroundChannel] (val x: Self) extends AnyVal {
    
    inline def setDefaultChannel(value: String): Self = StObject.set(x, "defaultChannel", value.asInstanceOf[js.Any])
    
    inline def setDefaultChannelUndefined: Self = StObject.set(x, "defaultChannel", js.undefined)
  }
}
