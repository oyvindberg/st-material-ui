package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/styles/experimental_extendTheme.PaletteSkeleton> */
trait PartialPaletteSkeleton extends StObject {
  
  var bg: js.UndefOr[String] = js.undefined
}
object PartialPaletteSkeleton {
  
  inline def apply(): PartialPaletteSkeleton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaletteSkeleton]
  }
  
  extension [Self <: PartialPaletteSkeleton](x: Self) {
    
    inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
  }
}
