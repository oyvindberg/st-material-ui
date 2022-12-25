package com.olvind.mui.muiJoy

import com.olvind.mui.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalCloseModalContextMod extends Shortcut {
  
  @JSImport("@mui/joy/Modal/CloseModalContext", JSImport.Default)
  @js.native
  val default: Context[
    js.UndefOr[
      js.Function2[
        /* event */ js.Object, 
        /* reason */ "backdropClick" | "escapeKeyDown" | "closeClick", 
        Unit
      ]
    ]
  ] = js.native
  
  type _To = Context[
    js.UndefOr[
      js.Function2[
        /* event */ js.Object, 
        /* reason */ "backdropClick" | "escapeKeyDown" | "closeClick", 
        Unit
      ]
    ]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `modalCloseModalContextMod.foo` */
  override def _to: Context[
    js.UndefOr[
      js.Function2[
        /* event */ js.Object, 
        /* reason */ "backdropClick" | "escapeKeyDown" | "closeClick", 
        Unit
      ]
    ]
  ] = default
}
