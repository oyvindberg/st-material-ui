package com.olvind.mui.muiJoy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<PopperUnstyledProps<'div', {}>, 'disablePortal' | 'direction' | 'keepMounted' | 'modifiers'> */
trait PickPopperUnstyledPropsdivdisablePortald extends StObject {
  
  var direction: js.UndefOr["ltr" | "rtl"] = js.undefined
  
  var disablePortal: js.UndefOr[Boolean] = js.undefined
  
  var keepMounted: js.UndefOr[Boolean] = js.undefined
  
  var modifiers: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options * / any['modifiers'] */ js.Any
  ] = js.undefined
}
object PickPopperUnstyledPropsdivdisablePortald {
  
  inline def apply(): PickPopperUnstyledPropsdivdisablePortald = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickPopperUnstyledPropsdivdisablePortald]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickPopperUnstyledPropsdivdisablePortald] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: "ltr" | "rtl"): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDisablePortal(value: Boolean): Self = StObject.set(x, "disablePortal", value.asInstanceOf[js.Any])
    
    inline def setDisablePortalUndefined: Self = StObject.set(x, "disablePortal", js.undefined)
    
    inline def setKeepMounted(value: Boolean): Self = StObject.set(x, "keepMounted", value.asInstanceOf[js.Any])
    
    inline def setKeepMountedUndefined: Self = StObject.set(x, "keepMounted", js.undefined)
    
    inline def setModifiers(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options * / any['modifiers'] */ js.Any
    ): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
  }
}
