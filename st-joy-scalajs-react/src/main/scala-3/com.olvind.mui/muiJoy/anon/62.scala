package com.olvind.mui.muiJoy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `62`[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  color :@mui/joy.@mui/joy/styles/types/colorSystem.ColorPaletteProp | 'inherit' | undefined} */ js.Any */] extends StObject {
  
  var color: (/* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any) | "context"
}
object `62` {
  
  inline def apply[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  color :@mui/joy.@mui/joy/styles/types/colorSystem.ColorPaletteProp | 'inherit' | undefined} */ js.Any */](
    color: (/* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any) | "context"
  ): `62`[T] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[`62`[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `62`[?], T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  color :@mui/joy.@mui/joy/styles/types/colorSystem.ColorPaletteProp | 'inherit' | undefined} */ js.Any */] (val x: Self & `62`[T]) extends AnyVal {
    
    inline def setColor(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T['color'] */ js.Any) | "context"
    ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
